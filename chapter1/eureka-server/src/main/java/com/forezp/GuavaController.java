package com.forezp;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.base.Optional;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;

@Controller
@RequestMapping
public class GuavaController {
	@ResponseBody
	@RequestMapping(value="/isNotNull")
    public Programmer isNotNull(String key) throws ExecutionException {
    //	Optional<Programmer> optional=this.sealObject();
    	/*try {
    		  // If the key wasn't in the "easy to compute" group, we need to
    		  // do things the hard way.
    		Programmer prom= cache.get("liudehua", new Callable<Programmer>() {
    		    @Override
    		    public Programmer call() throws Exception {
    		      return new Programmer("zhangxueyou","35");
    		    }
    		  });
    		return prom;
    		} catch (ExecutionException e) {
                 return new Programmer("exception","null");
    		}*/
		return cache.get(key);
    }
	
	private Optional<Programmer> sealObject(){
		Programmer er=new Programmer();
		er.setAge("10");
		er.setName("liuhu");
		er.setHome("anhui");
		er=null;
		return Optional.of(er);
	}
	public static com.google.common.cache.CacheLoader<String, Programmer> createCacheLoader() {
	       return new com.google.common.cache.CacheLoader<String, Programmer>() {
	           @Override
	           public Programmer load(String key) throws Exception {
	               System.out.println("自动加载缓存。。。。");
	               return new Programmer(key,"20");
	           }
	       };
	  }
	 LoadingCache<String, Programmer> cache = CacheBuilder.newBuilder()
	               .maximumSize(1000)
	               .expireAfterAccess(30L, TimeUnit.MILLISECONDS)
	               .build(createCacheLoader());
}

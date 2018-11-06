package de.lmis.mla.kotlin

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.concurrent.atomic.AtomicLong


@RestController
class GreetingController {

    val idGenerator = AtomicLong()
    		
	
//	@CrossOrigin(origins = {"http://localhost:3000"}, maxAge= 6000)
	@CrossOrigin
    @RequestMapping("/hello")
    fun hello(name: String): Greeting {
        val id = idGenerator.incrementAndGet()
        println(name);
        return Greeting(id, "$name, from Kotlin!")
    }

}
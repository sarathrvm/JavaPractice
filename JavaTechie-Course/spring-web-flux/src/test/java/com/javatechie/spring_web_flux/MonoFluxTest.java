package com.javatechie.spring_web_flux;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

    @Test
    public void testMono(){
        Mono<?> monoString = Mono.just("javaTechie")
                .then(Mono.error(new RuntimeException("Failed in mono")))
                .log();

        monoString.subscribe(s -> System.out.println(s),e-> System.out.println(e));

    }

    @Test
    public void testFlux(){
        Flux<String> stringFlux = Flux.just("java", "spring", "aws", "terraform")
                .concatWithValues("cloud")
                .concatWith(Flux.error(new RuntimeException("Failed in Flux")))
                .log();

        stringFlux.subscribe(s-> System.out.println(s),e-> System.out.println(e));



    }
}

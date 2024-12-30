package ie.atu.searchservice.feing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "UserService", url = "localhost:8080/api/users/")
public interface TestBindings {
    @PostMapping("/test")
    String test();
}

package com.vmware.carbonblackcloud.deviceanalytics.spring

import com.vmware.carbonblackcloud.deviceanalytics.DeviceAssignment
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import java.util.*

@Controller
class HelloController {

    @GetMapping("/hello")
    fun hello(model: Model): String {
        val assignment = DeviceAssignment(
                Date(),
                "javaDevice",
                "javaOrg",
                "javaHash",
                "javaShard",
                "javaHost"
        )
        model.addAttribute("deviceAssignment", assignment)
        return "hello"
    }
}
package com.tyss.springcore.configpackage;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Import({ EmployeeConfing.class,DemportmentConifg.class})
@Configuration
public class AllConfingFile {

}

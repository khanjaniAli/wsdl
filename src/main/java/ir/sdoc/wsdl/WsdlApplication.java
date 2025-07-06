package ir.sdoc.wsdl;

import ir.sdoc.wsdl.ws.web.Calculator;
import ir.sdoc.wsdl.ws.web.CalculatorSoap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WsdlApplication {

    public static void main(String[] args) {
        SpringApplication.run(WsdlApplication.class, args);
        Calculator calculator = new Calculator();
        CalculatorSoap calculatorSoap = calculator.getCalculatorSoap();
        int add = calculatorSoap.add(1, 2);
        System.out.println(add);
    }

}

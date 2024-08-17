package com.xiaoxu.xuojsandbox;


import com.xiaoxu.xuojsandbox.model.ExecuteCodeRequest;
import com.xiaoxu.xuojsandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/**
 * java原生沙箱实现（复用模板方法）
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {


    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }

}




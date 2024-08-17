package com.xiaoxu.xuojsandbox;

import com.xiaoxu.xuojsandbox.model.ExecuteCodeRequest;
import com.xiaoxu.xuojsandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);

    }

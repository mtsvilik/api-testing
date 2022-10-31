package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;

@Endpoint(url = "${config.env.url}/repos/${username}/${repo}", methodType = HttpMethodType.PATCH)
@RequestTemplatePath(path = "api.repos/_patch/rq.json")
@ResponseTemplatePath(path = "api.repos/_patch/rs.json")
public class PatchRepoMethod extends AbstractApiMethodV2 {

    public PatchRepoMethod() {
        replaceUrlPlaceholder("username", "mtsvilik");
        replaceUrlPlaceholder("repo", "test-repo");
    }
}

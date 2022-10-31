package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@Endpoint(url = "${config.env.url}/repos/${username}/${repo}", methodType = HttpMethodType.DELETE)
@SuccessfulHttpStatus(status = HttpResponseStatusType.NO_CONTENT_204)
public class DeleteRepoMethod extends AbstractApiMethodV2 {
    public DeleteRepoMethod() {
        replaceUrlPlaceholder("username", Configuration.getEnvArg("mtsvilik"));
        replaceUrlPlaceholder("repo", Configuration.getEnvArg("test-repo"));
    }
}

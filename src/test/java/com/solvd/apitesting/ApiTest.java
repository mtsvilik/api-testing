package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.R;
import org.testng.annotations.Test;

public class ApiTest {

    @Test(testName = "check create repo method")
    public void checkPostRepoTest() {
        PostRepoMethod postRepoMethod = new PostRepoMethod("api.repos/_post/rq.json",
                null);
        postRepoMethod.setHeaders(R.CONFIG.get("token"));
        postRepoMethod.addProperty("userName", "mtsvilik");
        postRepoMethod.addProperty("repoName", "test-repo");
        postRepoMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postRepoMethod.callAPI();
        postRepoMethod.validateResponse();
    }

    @Test(testName = "check update repo method")
    public void checkPatchRepoMethod() {
        PatchRepoMethod patchRepoMethod = new PatchRepoMethod();
        patchRepoMethod.setHeaders(R.CONFIG.get("token"));
        patchRepoMethod.addProperty("description", "new test description");
        patchRepoMethod.addProperty("userName", "mtsvilik");
        patchRepoMethod.addProperty("repoName", "test-repo");
        patchRepoMethod.callAPI();
        patchRepoMethod.validateResponse();
    }

    @Test(testName = "check get user method")
    public void checkGetUserTest() {
        GetUserMethod getUserMethod = new GetUserMethod(null, "api.users/_get/rs.json");
        getUserMethod.addProperty("userName", "mtsvilik");
        getUserMethod.callAPI();
        getUserMethod.validateResponse();
    }

    @Test(testName = "check get repo method")
    public void checkGetRepoTest() {
        GetRepoMethod getRepoMethod = new GetRepoMethod(null, "api.repos/_get/rs.json");
        getRepoMethod.addProperty("userName", "mtsvilik");
        getRepoMethod.addProperty("repoName", "test-repo");
        getRepoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getRepoMethod.callAPI();
    }

    @Test(testName = "check delete repo method")
    public void checkDeleteRepoTest() {
        DeleteRepoMethod deleteRepoMethod = new DeleteRepoMethod();
        deleteRepoMethod.setHeaders(R.CONFIG.get("token"));
        deleteRepoMethod.callAPI();
    }
}

package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class ApiTest {

    @Test(testName = "check create repo method")
    public void checkPostRepoTest() {
        PostRepoMethod postRepoMethod = new PostRepoMethod("api.repos/_post/rq.json",
                "api.repos/_post/rs.json", "api.repos/repo.properties");
        postRepoMethod.setHeaders(String.format("Authorization=%s", "token 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"));
        postRepoMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postRepoMethod.callAPI();
        postRepoMethod.validateResponse();
    }

    @Test(testName = "check update repo method")
    public void checkPatchRepoMethod() {
        PatchRepoMethod patchRepoMethod = new PatchRepoMethod("api.repos/_patch/rq.json",
                "api.repos/_patch/rs.json", "api.repos/repo.properties");
        patchRepoMethod.setHeaders(String.format("Authorization=%s", "token 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"));
        patchRepoMethod.callAPI();
        patchRepoMethod.validateResponse();
    }

    @Test(testName = "check get user method")
    public void checkGetUserTest() {
        GetUserMethod getUserMethod = new GetUserMethod(null, "api.users/_get/rs.json");
        getUserMethod.callAPI();
        getUserMethod.validateResponse();
    }

    @Test(testName = "check get repo method")
    public void checkGetRepoTest() {
        GetRepoMethod getRepoMethod = new GetRepoMethod(null, "api.repos/_get/rs.json",
                "api.repos/repo.properties");
        getRepoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getRepoMethod.callAPI();
    }

    @Test(testName = "check delete repo method")
    public void checkDeleteRepoTest() {
        DeleteRepoMethod deleteRepoMethod = new DeleteRepoMethod();
        deleteRepoMethod.setHeaders(String.format("Authorization=%s", "token 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"));
        deleteRepoMethod.callAPI();
    }
}

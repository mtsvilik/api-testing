package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PatchRepoMethod extends AbstractApiMethodV2 {

    public PatchRepoMethod(String rqPath, String rsPath, String propertiesPath) {
        super(rqPath, rsPath, propertiesPath);
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("url"));
    }
}

package io.branch.branchster;

import android.support.multidex.MultiDexApplication;

import io.branch.indexing.BranchUniversalObject;
import io.branch.referral.Branch;

import java.util.Random;
import java.util.UUID;

import io.branch.referral.Branch;
import io.branch.referral.util.ContentMetadata;

/**
 * Created by tanay on 6/23/18.
 */

public class SE_Tanay_Nigam extends MultiDexApplication{

    @Override
    public void onCreate() {
        super.onCreate();

        // Branch logging for debugging
        Branch.enableLogging();

        // Branch object initialization
        Branch.getAutoInstance(this);

        BranchUniversalObject buo = new BranchUniversalObject()
                .setCanonicalIdentifier("content/12345")
                .setTitle("My Content Title")
                .setContentDescription("My Content Description")
                .setContentImageUrl("https://lorempixel.com/400/400")
                .setContentIndexingMode(BranchUniversalObject.CONTENT_INDEX_MODE.PUBLIC)
                .setLocalIndexMode(BranchUniversalObject.CONTENT_INDEX_MODE.PUBLIC)
                .setContentMetadata(new ContentMetadata().addCustomMetadata("key1", "value1"));
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scaleway.inputs.ObjectBucketLifecycleRuleExpirationArgs;
import com.pulumi.scaleway.inputs.ObjectBucketLifecycleRuleTransitionArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectBucketLifecycleRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectBucketLifecycleRuleArgs Empty = new ObjectBucketLifecycleRuleArgs();

    @Import(name="abortIncompleteMultipartUploadDays")
    private @Nullable Output<Integer> abortIncompleteMultipartUploadDays;

    public Optional<Output<Integer>> abortIncompleteMultipartUploadDays() {
        return Optional.ofNullable(this.abortIncompleteMultipartUploadDays);
    }

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    @Import(name="expiration")
    private @Nullable Output<ObjectBucketLifecycleRuleExpirationArgs> expiration;

    public Optional<Output<ObjectBucketLifecycleRuleExpirationArgs>> expiration() {
        return Optional.ofNullable(this.expiration);
    }

    /**
     * The unique name of the bucket.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The unique name of the bucket.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * A list of tags (key / value) for the bucket.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A list of tags (key / value) for the bucket.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="transitions")
    private @Nullable Output<List<ObjectBucketLifecycleRuleTransitionArgs>> transitions;

    public Optional<Output<List<ObjectBucketLifecycleRuleTransitionArgs>>> transitions() {
        return Optional.ofNullable(this.transitions);
    }

    private ObjectBucketLifecycleRuleArgs() {}

    private ObjectBucketLifecycleRuleArgs(ObjectBucketLifecycleRuleArgs $) {
        this.abortIncompleteMultipartUploadDays = $.abortIncompleteMultipartUploadDays;
        this.enabled = $.enabled;
        this.expiration = $.expiration;
        this.id = $.id;
        this.prefix = $.prefix;
        this.tags = $.tags;
        this.transitions = $.transitions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectBucketLifecycleRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectBucketLifecycleRuleArgs $;

        public Builder() {
            $ = new ObjectBucketLifecycleRuleArgs();
        }

        public Builder(ObjectBucketLifecycleRuleArgs defaults) {
            $ = new ObjectBucketLifecycleRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder abortIncompleteMultipartUploadDays(@Nullable Output<Integer> abortIncompleteMultipartUploadDays) {
            $.abortIncompleteMultipartUploadDays = abortIncompleteMultipartUploadDays;
            return this;
        }

        public Builder abortIncompleteMultipartUploadDays(Integer abortIncompleteMultipartUploadDays) {
            return abortIncompleteMultipartUploadDays(Output.of(abortIncompleteMultipartUploadDays));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder expiration(@Nullable Output<ObjectBucketLifecycleRuleExpirationArgs> expiration) {
            $.expiration = expiration;
            return this;
        }

        public Builder expiration(ObjectBucketLifecycleRuleExpirationArgs expiration) {
            return expiration(Output.of(expiration));
        }

        /**
         * @param id The unique name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param tags A list of tags (key / value) for the bucket.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags (key / value) for the bucket.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder transitions(@Nullable Output<List<ObjectBucketLifecycleRuleTransitionArgs>> transitions) {
            $.transitions = transitions;
            return this;
        }

        public Builder transitions(List<ObjectBucketLifecycleRuleTransitionArgs> transitions) {
            return transitions(Output.of(transitions));
        }

        public Builder transitions(ObjectBucketLifecycleRuleTransitionArgs... transitions) {
            return transitions(List.of(transitions));
        }

        public ObjectBucketLifecycleRuleArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
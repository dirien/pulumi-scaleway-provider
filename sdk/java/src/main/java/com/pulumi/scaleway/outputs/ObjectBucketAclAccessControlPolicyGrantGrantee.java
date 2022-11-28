// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObjectBucketAclAccessControlPolicyGrantGrantee {
    private @Nullable String displayName;
    /**
     * @return The `region`,`bucket` and `acl` separated by (`/`).
     * 
     */
    private String id;
    private String type;

    private ObjectBucketAclAccessControlPolicyGrantGrantee() {}
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return The `region`,`bucket` and `acl` separated by (`/`).
     * 
     */
    public String id() {
        return this.id;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectBucketAclAccessControlPolicyGrantGrantee defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String displayName;
        private String id;
        private String type;
        public Builder() {}
        public Builder(ObjectBucketAclAccessControlPolicyGrantGrantee defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ObjectBucketAclAccessControlPolicyGrantGrantee build() {
            final var o = new ObjectBucketAclAccessControlPolicyGrantGrantee();
            o.displayName = displayName;
            o.id = id;
            o.type = type;
            return o;
        }
    }
}
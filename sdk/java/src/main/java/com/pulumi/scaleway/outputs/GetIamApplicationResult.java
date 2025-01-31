// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIamApplicationResult {
    private @Nullable String applicationId;
    private String createdAt;
    private String description;
    private Boolean editable;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String name;
    private @Nullable String organizationId;
    private String updatedAt;

    private GetIamApplicationResult() {}
    public Optional<String> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }
    public String createdAt() {
        return this.createdAt;
    }
    public String description() {
        return this.description;
    }
    public Boolean editable() {
        return this.editable;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIamApplicationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String applicationId;
        private String createdAt;
        private String description;
        private Boolean editable;
        private String id;
        private @Nullable String name;
        private @Nullable String organizationId;
        private String updatedAt;
        public Builder() {}
        public Builder(GetIamApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.createdAt = defaults.createdAt;
    	      this.description = defaults.description;
    	      this.editable = defaults.editable;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.updatedAt = defaults.updatedAt;
        }

        @CustomType.Setter
        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder editable(Boolean editable) {
            this.editable = Objects.requireNonNull(editable);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(@Nullable String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        public GetIamApplicationResult build() {
            final var o = new GetIamApplicationResult();
            o.applicationId = applicationId;
            o.createdAt = createdAt;
            o.description = description;
            o.editable = editable;
            o.id = id;
            o.name = name;
            o.organizationId = organizationId;
            o.updatedAt = updatedAt;
            return o;
        }
    }
}

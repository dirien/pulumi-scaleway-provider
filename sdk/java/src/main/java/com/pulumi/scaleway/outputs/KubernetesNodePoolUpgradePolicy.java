// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesNodePoolUpgradePolicy {
    /**
     * @return The maximum number of nodes to be created during the upgrade
     * 
     */
    private @Nullable Integer maxSurge;
    /**
     * @return The maximum number of nodes that can be not ready at the same time
     * 
     */
    private @Nullable Integer maxUnavailable;

    private KubernetesNodePoolUpgradePolicy() {}
    /**
     * @return The maximum number of nodes to be created during the upgrade
     * 
     */
    public Optional<Integer> maxSurge() {
        return Optional.ofNullable(this.maxSurge);
    }
    /**
     * @return The maximum number of nodes that can be not ready at the same time
     * 
     */
    public Optional<Integer> maxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesNodePoolUpgradePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer maxSurge;
        private @Nullable Integer maxUnavailable;
        public Builder() {}
        public Builder(KubernetesNodePoolUpgradePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        @CustomType.Setter
        public Builder maxSurge(@Nullable Integer maxSurge) {
            this.maxSurge = maxSurge;
            return this;
        }
        @CustomType.Setter
        public Builder maxUnavailable(@Nullable Integer maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public KubernetesNodePoolUpgradePolicy build() {
            final var o = new KubernetesNodePoolUpgradePolicy();
            o.maxSurge = maxSurge;
            o.maxUnavailable = maxUnavailable;
            return o;
        }
    }
}
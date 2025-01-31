// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstancePrivateNicState extends com.pulumi.resources.ResourceArgs {

    public static final InstancePrivateNicState Empty = new InstancePrivateNicState();

    /**
     * The MAC address of the private NIC.
     * 
     */
    @Import(name="macAddress")
    private @Nullable Output<String> macAddress;

    /**
     * @return The MAC address of the private NIC.
     * 
     */
    public Optional<Output<String>> macAddress() {
        return Optional.ofNullable(this.macAddress);
    }

    /**
     * The ID of the private network attached to.
     * 
     */
    @Import(name="privateNetworkId")
    private @Nullable Output<String> privateNetworkId;

    /**
     * @return The ID of the private network attached to.
     * 
     */
    public Optional<Output<String>> privateNetworkId() {
        return Optional.ofNullable(this.privateNetworkId);
    }

    /**
     * The ID of the server associated with.
     * 
     */
    @Import(name="serverId")
    private @Nullable Output<String> serverId;

    /**
     * @return The ID of the server associated with.
     * 
     */
    public Optional<Output<String>> serverId() {
        return Optional.ofNullable(this.serverId);
    }

    /**
     * `zone`) The zone in which the server must be created.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return `zone`) The zone in which the server must be created.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private InstancePrivateNicState() {}

    private InstancePrivateNicState(InstancePrivateNicState $) {
        this.macAddress = $.macAddress;
        this.privateNetworkId = $.privateNetworkId;
        this.serverId = $.serverId;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstancePrivateNicState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePrivateNicState $;

        public Builder() {
            $ = new InstancePrivateNicState();
        }

        public Builder(InstancePrivateNicState defaults) {
            $ = new InstancePrivateNicState(Objects.requireNonNull(defaults));
        }

        /**
         * @param macAddress The MAC address of the private NIC.
         * 
         * @return builder
         * 
         */
        public Builder macAddress(@Nullable Output<String> macAddress) {
            $.macAddress = macAddress;
            return this;
        }

        /**
         * @param macAddress The MAC address of the private NIC.
         * 
         * @return builder
         * 
         */
        public Builder macAddress(String macAddress) {
            return macAddress(Output.of(macAddress));
        }

        /**
         * @param privateNetworkId The ID of the private network attached to.
         * 
         * @return builder
         * 
         */
        public Builder privateNetworkId(@Nullable Output<String> privateNetworkId) {
            $.privateNetworkId = privateNetworkId;
            return this;
        }

        /**
         * @param privateNetworkId The ID of the private network attached to.
         * 
         * @return builder
         * 
         */
        public Builder privateNetworkId(String privateNetworkId) {
            return privateNetworkId(Output.of(privateNetworkId));
        }

        /**
         * @param serverId The ID of the server associated with.
         * 
         * @return builder
         * 
         */
        public Builder serverId(@Nullable Output<String> serverId) {
            $.serverId = serverId;
            return this;
        }

        /**
         * @param serverId The ID of the server associated with.
         * 
         * @return builder
         * 
         */
        public Builder serverId(String serverId) {
            return serverId(Output.of(serverId));
        }

        /**
         * @param zone `zone`) The zone in which the server must be created.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone `zone`) The zone in which the server must be created.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public InstancePrivateNicState build() {
            return $;
        }
    }

}

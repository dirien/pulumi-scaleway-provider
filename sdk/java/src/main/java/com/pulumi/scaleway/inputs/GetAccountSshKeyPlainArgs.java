// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountSshKeyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountSshKeyPlainArgs Empty = new GetAccountSshKeyPlainArgs();

    /**
     * The SSH key name. Only one of `name` and `ssh_key_id` should be specified.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The SSH key name. Only one of `name` and `ssh_key_id` should be specified.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The SSH key id. Only one of `name` and `ssh_key_id` should be specified.
     * 
     */
    @Import(name="sshKeyId")
    private @Nullable String sshKeyId;

    /**
     * @return The SSH key id. Only one of `name` and `ssh_key_id` should be specified.
     * 
     */
    public Optional<String> sshKeyId() {
        return Optional.ofNullable(this.sshKeyId);
    }

    private GetAccountSshKeyPlainArgs() {}

    private GetAccountSshKeyPlainArgs(GetAccountSshKeyPlainArgs $) {
        this.name = $.name;
        this.sshKeyId = $.sshKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountSshKeyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountSshKeyPlainArgs $;

        public Builder() {
            $ = new GetAccountSshKeyPlainArgs();
        }

        public Builder(GetAccountSshKeyPlainArgs defaults) {
            $ = new GetAccountSshKeyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The SSH key name. Only one of `name` and `ssh_key_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param sshKeyId The SSH key id. Only one of `name` and `ssh_key_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder sshKeyId(@Nullable String sshKeyId) {
            $.sshKeyId = sshKeyId;
            return this;
        }

        public GetAccountSshKeyPlainArgs build() {
            return $;
        }
    }

}

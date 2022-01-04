// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scaleway.Inputs
{

    public sealed class LoadbalancerPrivateNetworkGetArgs : Pulumi.ResourceArgs
    {
        [Input("dhcpConfig")]
        public Input<bool>? DhcpConfig { get; set; }

        [Input("privateNetworkId", required: true)]
        public Input<string> PrivateNetworkId { get; set; } = null!;

        [Input("staticConfigs")]
        private InputList<string>? _staticConfigs;
        public InputList<string> StaticConfigs
        {
            get => _staticConfigs ?? (_staticConfigs = new InputList<string>());
            set => _staticConfigs = value;
        }

        /// <summary>
        /// The Private Network attachment status
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// `zone`) The zone in which the IP should be reserved.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public LoadbalancerPrivateNetworkGetArgs()
        {
        }
    }
}
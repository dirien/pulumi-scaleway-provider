// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scaleway.Inputs
{

    public sealed class ObjectBucketVersioningArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public ObjectBucketVersioningArgs()
        {
        }
    }
}
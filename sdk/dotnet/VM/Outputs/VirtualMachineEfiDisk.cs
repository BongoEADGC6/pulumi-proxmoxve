// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Outputs
{

    [OutputType]
    public sealed class VirtualMachineEfiDisk
    {
        public readonly string? DatastoreId;
        public readonly string? FileFormat;
        public readonly bool? PreEnrolledKeys;
        public readonly string? Type;

        [OutputConstructor]
        private VirtualMachineEfiDisk(
            string? datastoreId,

            string? fileFormat,

            bool? preEnrolledKeys,

            string? type)
        {
            DatastoreId = datastoreId;
            FileFormat = fileFormat;
            PreEnrolledKeys = preEnrolledKeys;
            Type = type;
        }
    }
}
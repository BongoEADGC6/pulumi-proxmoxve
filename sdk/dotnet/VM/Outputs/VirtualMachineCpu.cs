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
    public sealed class VirtualMachineCpu
    {
        public readonly string? Architecture;
        public readonly int? Cores;
        public readonly ImmutableArray<string> Flags;
        public readonly int? Hotplugged;
        public readonly bool? Numa;
        public readonly int? Sockets;
        public readonly string? Type;
        public readonly int? Units;

        [OutputConstructor]
        private VirtualMachineCpu(
            string? architecture,

            int? cores,

            ImmutableArray<string> flags,

            int? hotplugged,

            bool? numa,

            int? sockets,

            string? type,

            int? units)
        {
            Architecture = architecture;
            Cores = cores;
            Flags = flags;
            Hotplugged = hotplugged;
            Numa = numa;
            Sockets = sockets;
            Type = type;
            Units = units;
        }
    }
}

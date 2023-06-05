// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Permission.Outputs
{

    [OutputType]
    public sealed class GetUserAclResult
    {
        public readonly string Path;
        public readonly bool Propagate;
        public readonly string RoleId;

        [OutputConstructor]
        private GetUserAclResult(
            string path,

            bool propagate,

            string roleId)
        {
            Path = path;
            Propagate = propagate;
            RoleId = roleId;
        }
    }
}
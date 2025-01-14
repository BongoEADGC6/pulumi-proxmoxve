// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package permission

import (
	"github.com/muhlba91/pulumi-proxmoxve/sdk/v5/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetGroups(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetGroupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGroupsResult
	err := ctx.Invoke("proxmoxve:Permission/getGroups:getGroups", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getGroups.
type GetGroupsResult struct {
	Comments []string `pulumi:"comments"`
	GroupIds []string `pulumi:"groupIds"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

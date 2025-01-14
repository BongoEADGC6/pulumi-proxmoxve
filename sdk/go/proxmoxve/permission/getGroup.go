// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package permission

import (
	"context"
	"reflect"

	"github.com/muhlba91/pulumi-proxmoxve/sdk/v5/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

func LookupGroup(ctx *pulumi.Context, args *LookupGroupArgs, opts ...pulumi.InvokeOption) (*LookupGroupResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupGroupResult
	err := ctx.Invoke("proxmoxve:Permission/getGroup:getGroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGroup.
type LookupGroupArgs struct {
	GroupId string `pulumi:"groupId"`
}

// A collection of values returned by getGroup.
type LookupGroupResult struct {
	Acls    []GetGroupAcl `pulumi:"acls"`
	Comment string        `pulumi:"comment"`
	GroupId string        `pulumi:"groupId"`
	// The provider-assigned unique ID for this managed resource.
	Id      string   `pulumi:"id"`
	Members []string `pulumi:"members"`
}

func LookupGroupOutput(ctx *pulumi.Context, args LookupGroupOutputArgs, opts ...pulumi.InvokeOption) LookupGroupResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupGroupResult, error) {
			args := v.(LookupGroupArgs)
			r, err := LookupGroup(ctx, &args, opts...)
			var s LookupGroupResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupGroupResultOutput)
}

// A collection of arguments for invoking getGroup.
type LookupGroupOutputArgs struct {
	GroupId pulumi.StringInput `pulumi:"groupId"`
}

func (LookupGroupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGroupArgs)(nil)).Elem()
}

// A collection of values returned by getGroup.
type LookupGroupResultOutput struct{ *pulumi.OutputState }

func (LookupGroupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGroupResult)(nil)).Elem()
}

func (o LookupGroupResultOutput) ToLookupGroupResultOutput() LookupGroupResultOutput {
	return o
}

func (o LookupGroupResultOutput) ToLookupGroupResultOutputWithContext(ctx context.Context) LookupGroupResultOutput {
	return o
}

func (o LookupGroupResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupGroupResult] {
	return pulumix.Output[LookupGroupResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupGroupResultOutput) Acls() GetGroupAclArrayOutput {
	return o.ApplyT(func(v LookupGroupResult) []GetGroupAcl { return v.Acls }).(GetGroupAclArrayOutput)
}

func (o LookupGroupResultOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGroupResult) string { return v.Comment }).(pulumi.StringOutput)
}

func (o LookupGroupResultOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGroupResult) string { return v.GroupId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupGroupResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGroupResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupGroupResultOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupGroupResult) []string { return v.Members }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGroupResultOutput{})
}

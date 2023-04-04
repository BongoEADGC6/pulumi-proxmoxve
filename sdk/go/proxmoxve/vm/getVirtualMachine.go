// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vm

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupVirtualMachine(ctx *pulumi.Context, args *LookupVirtualMachineArgs, opts ...pulumi.InvokeOption) (*LookupVirtualMachineResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupVirtualMachineResult
	err := ctx.Invoke("proxmoxve:VM/getVirtualMachine:getVirtualMachine", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVirtualMachine.
type LookupVirtualMachineArgs struct {
	NodeName string `pulumi:"nodeName"`
	VmId     int    `pulumi:"vmId"`
}

// A collection of values returned by getVirtualMachine.
type LookupVirtualMachineResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id       string   `pulumi:"id"`
	Name     string   `pulumi:"name"`
	NodeName string   `pulumi:"nodeName"`
	Tags     []string `pulumi:"tags"`
	VmId     int      `pulumi:"vmId"`
}

func LookupVirtualMachineOutput(ctx *pulumi.Context, args LookupVirtualMachineOutputArgs, opts ...pulumi.InvokeOption) LookupVirtualMachineResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupVirtualMachineResult, error) {
			args := v.(LookupVirtualMachineArgs)
			r, err := LookupVirtualMachine(ctx, &args, opts...)
			var s LookupVirtualMachineResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupVirtualMachineResultOutput)
}

// A collection of arguments for invoking getVirtualMachine.
type LookupVirtualMachineOutputArgs struct {
	NodeName pulumi.StringInput `pulumi:"nodeName"`
	VmId     pulumi.IntInput    `pulumi:"vmId"`
}

func (LookupVirtualMachineOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVirtualMachineArgs)(nil)).Elem()
}

// A collection of values returned by getVirtualMachine.
type LookupVirtualMachineResultOutput struct{ *pulumi.OutputState }

func (LookupVirtualMachineResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVirtualMachineResult)(nil)).Elem()
}

func (o LookupVirtualMachineResultOutput) ToLookupVirtualMachineResultOutput() LookupVirtualMachineResultOutput {
	return o
}

func (o LookupVirtualMachineResultOutput) ToLookupVirtualMachineResultOutputWithContext(ctx context.Context) LookupVirtualMachineResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupVirtualMachineResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualMachineResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupVirtualMachineResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualMachineResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupVirtualMachineResultOutput) NodeName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualMachineResult) string { return v.NodeName }).(pulumi.StringOutput)
}

func (o LookupVirtualMachineResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupVirtualMachineResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func (o LookupVirtualMachineResultOutput) VmId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupVirtualMachineResult) int { return v.VmId }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupVirtualMachineResultOutput{})
}
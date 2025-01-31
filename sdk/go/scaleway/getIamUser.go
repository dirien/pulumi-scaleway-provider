// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information on an existing IAM user based on its ID or email address.
// For more information,
// see [the documentation](https://developers.scaleway.com/en/products/iam/api/v1alpha1/#users-06bdcf).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-scaleway/sdk/go/scaleway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err = scaleway.GetIamUser(ctx, &scaleway.GetIamUserArgs{
//				UserId: pulumi.StringRef("11111111-1111-1111-1111-111111111111"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = scaleway.GetIamUser(ctx, &scaleway.GetIamUserArgs{
//				Email: pulumi.StringRef("foo@bar.com"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetIamUser(ctx *pulumi.Context, args *GetIamUserArgs, opts ...pulumi.InvokeOption) (*GetIamUserResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetIamUserResult
	err := ctx.Invoke("scaleway:index/getIamUser:getIamUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIamUser.
type GetIamUserArgs struct {
	// The email address of the IAM user. Only one of the `email` and `userId` should be specified.
	Email *string `pulumi:"email"`
	// `organizationId`) The ID of the
	// organization the user is associated with. For now, it is necessary to
	// explicitly provide the `organizationId` in the datasource.
	OrganizationId *string `pulumi:"organizationId"`
	// The ID of the IAM user. Only one of the `email` and `userId` should be specified.
	UserId *string `pulumi:"userId"`
}

// A collection of values returned by getIamUser.
type GetIamUserResult struct {
	Email *string `pulumi:"email"`
	// The provider-assigned unique ID for this managed resource.
	Id             string  `pulumi:"id"`
	OrganizationId *string `pulumi:"organizationId"`
	UserId         *string `pulumi:"userId"`
}

func GetIamUserOutput(ctx *pulumi.Context, args GetIamUserOutputArgs, opts ...pulumi.InvokeOption) GetIamUserResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetIamUserResult, error) {
			args := v.(GetIamUserArgs)
			r, err := GetIamUser(ctx, &args, opts...)
			var s GetIamUserResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetIamUserResultOutput)
}

// A collection of arguments for invoking getIamUser.
type GetIamUserOutputArgs struct {
	// The email address of the IAM user. Only one of the `email` and `userId` should be specified.
	Email pulumi.StringPtrInput `pulumi:"email"`
	// `organizationId`) The ID of the
	// organization the user is associated with. For now, it is necessary to
	// explicitly provide the `organizationId` in the datasource.
	OrganizationId pulumi.StringPtrInput `pulumi:"organizationId"`
	// The ID of the IAM user. Only one of the `email` and `userId` should be specified.
	UserId pulumi.StringPtrInput `pulumi:"userId"`
}

func (GetIamUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIamUserArgs)(nil)).Elem()
}

// A collection of values returned by getIamUser.
type GetIamUserResultOutput struct{ *pulumi.OutputState }

func (GetIamUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIamUserResult)(nil)).Elem()
}

func (o GetIamUserResultOutput) ToGetIamUserResultOutput() GetIamUserResultOutput {
	return o
}

func (o GetIamUserResultOutput) ToGetIamUserResultOutputWithContext(ctx context.Context) GetIamUserResultOutput {
	return o
}

func (o GetIamUserResultOutput) Email() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetIamUserResult) *string { return v.Email }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetIamUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetIamUserResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetIamUserResultOutput) OrganizationId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetIamUserResult) *string { return v.OrganizationId }).(pulumi.StringPtrOutput)
}

func (o GetIamUserResultOutput) UserId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetIamUserResult) *string { return v.UserId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetIamUserResultOutput{})
}

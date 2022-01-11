// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type LoadbalancerCertificate struct {
	pulumi.CustomResourceState

	// Main domain of the certificate.
	CommonName pulumi.StringOutput `pulumi:"commonName"`
	// Configuration block for custom certificate chain. Only one of `letsencrypt` and `customCertificate` should be specified.
	CustomCertificate LoadbalancerCertificateCustomCertificatePtrOutput `pulumi:"customCertificate"`
	// The identifier (SHA-1) of the certificate
	Fingerprint pulumi.StringOutput `pulumi:"fingerprint"`
	// The load-balancer ID this certificate is attached to.
	LbId pulumi.StringOutput `pulumi:"lbId"`
	// Configuration block for Let's Encrypt configuration. Only one of `letsencrypt` and `customCertificate` should be specified.
	Letsencrypt LoadbalancerCertificateLetsencryptPtrOutput `pulumi:"letsencrypt"`
	// The name of the certificate backend.
	Name pulumi.StringOutput `pulumi:"name"`
	// The not valid after validity bound timestamp
	NotValidAfter pulumi.StringOutput `pulumi:"notValidAfter"`
	// The not valid before validity bound timestamp
	NotValidBefore pulumi.StringOutput `pulumi:"notValidBefore"`
	// Certificate status
	Status pulumi.StringOutput `pulumi:"status"`
	// Array of alternative domain names.
	SubjectAlternativeNames pulumi.StringArrayOutput `pulumi:"subjectAlternativeNames"`
}

// NewLoadbalancerCertificate registers a new resource with the given unique name, arguments, and options.
func NewLoadbalancerCertificate(ctx *pulumi.Context,
	name string, args *LoadbalancerCertificateArgs, opts ...pulumi.ResourceOption) (*LoadbalancerCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LbId == nil {
		return nil, errors.New("invalid value for required argument 'LbId'")
	}
	var resource LoadbalancerCertificate
	err := ctx.RegisterResource("scaleway:index/loadbalancerCertificate:LoadbalancerCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadbalancerCertificate gets an existing LoadbalancerCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadbalancerCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadbalancerCertificateState, opts ...pulumi.ResourceOption) (*LoadbalancerCertificate, error) {
	var resource LoadbalancerCertificate
	err := ctx.ReadResource("scaleway:index/loadbalancerCertificate:LoadbalancerCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadbalancerCertificate resources.
type loadbalancerCertificateState struct {
	// Main domain of the certificate.
	CommonName *string `pulumi:"commonName"`
	// Configuration block for custom certificate chain. Only one of `letsencrypt` and `customCertificate` should be specified.
	CustomCertificate *LoadbalancerCertificateCustomCertificate `pulumi:"customCertificate"`
	// The identifier (SHA-1) of the certificate
	Fingerprint *string `pulumi:"fingerprint"`
	// The load-balancer ID this certificate is attached to.
	LbId *string `pulumi:"lbId"`
	// Configuration block for Let's Encrypt configuration. Only one of `letsencrypt` and `customCertificate` should be specified.
	Letsencrypt *LoadbalancerCertificateLetsencrypt `pulumi:"letsencrypt"`
	// The name of the certificate backend.
	Name *string `pulumi:"name"`
	// The not valid after validity bound timestamp
	NotValidAfter *string `pulumi:"notValidAfter"`
	// The not valid before validity bound timestamp
	NotValidBefore *string `pulumi:"notValidBefore"`
	// Certificate status
	Status *string `pulumi:"status"`
	// Array of alternative domain names.
	SubjectAlternativeNames []string `pulumi:"subjectAlternativeNames"`
}

type LoadbalancerCertificateState struct {
	// Main domain of the certificate.
	CommonName pulumi.StringPtrInput
	// Configuration block for custom certificate chain. Only one of `letsencrypt` and `customCertificate` should be specified.
	CustomCertificate LoadbalancerCertificateCustomCertificatePtrInput
	// The identifier (SHA-1) of the certificate
	Fingerprint pulumi.StringPtrInput
	// The load-balancer ID this certificate is attached to.
	LbId pulumi.StringPtrInput
	// Configuration block for Let's Encrypt configuration. Only one of `letsencrypt` and `customCertificate` should be specified.
	Letsencrypt LoadbalancerCertificateLetsencryptPtrInput
	// The name of the certificate backend.
	Name pulumi.StringPtrInput
	// The not valid after validity bound timestamp
	NotValidAfter pulumi.StringPtrInput
	// The not valid before validity bound timestamp
	NotValidBefore pulumi.StringPtrInput
	// Certificate status
	Status pulumi.StringPtrInput
	// Array of alternative domain names.
	SubjectAlternativeNames pulumi.StringArrayInput
}

func (LoadbalancerCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadbalancerCertificateState)(nil)).Elem()
}

type loadbalancerCertificateArgs struct {
	// Configuration block for custom certificate chain. Only one of `letsencrypt` and `customCertificate` should be specified.
	CustomCertificate *LoadbalancerCertificateCustomCertificate `pulumi:"customCertificate"`
	// The load-balancer ID this certificate is attached to.
	LbId string `pulumi:"lbId"`
	// Configuration block for Let's Encrypt configuration. Only one of `letsencrypt` and `customCertificate` should be specified.
	Letsencrypt *LoadbalancerCertificateLetsencrypt `pulumi:"letsencrypt"`
	// The name of the certificate backend.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a LoadbalancerCertificate resource.
type LoadbalancerCertificateArgs struct {
	// Configuration block for custom certificate chain. Only one of `letsencrypt` and `customCertificate` should be specified.
	CustomCertificate LoadbalancerCertificateCustomCertificatePtrInput
	// The load-balancer ID this certificate is attached to.
	LbId pulumi.StringInput
	// Configuration block for Let's Encrypt configuration. Only one of `letsencrypt` and `customCertificate` should be specified.
	Letsencrypt LoadbalancerCertificateLetsencryptPtrInput
	// The name of the certificate backend.
	Name pulumi.StringPtrInput
}

func (LoadbalancerCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadbalancerCertificateArgs)(nil)).Elem()
}

type LoadbalancerCertificateInput interface {
	pulumi.Input

	ToLoadbalancerCertificateOutput() LoadbalancerCertificateOutput
	ToLoadbalancerCertificateOutputWithContext(ctx context.Context) LoadbalancerCertificateOutput
}

func (*LoadbalancerCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((*LoadbalancerCertificate)(nil))
}

func (i *LoadbalancerCertificate) ToLoadbalancerCertificateOutput() LoadbalancerCertificateOutput {
	return i.ToLoadbalancerCertificateOutputWithContext(context.Background())
}

func (i *LoadbalancerCertificate) ToLoadbalancerCertificateOutputWithContext(ctx context.Context) LoadbalancerCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadbalancerCertificateOutput)
}

type LoadbalancerCertificateOutput struct{ *pulumi.OutputState }

func (LoadbalancerCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LoadbalancerCertificate)(nil))
}

func (o LoadbalancerCertificateOutput) ToLoadbalancerCertificateOutput() LoadbalancerCertificateOutput {
	return o
}

func (o LoadbalancerCertificateOutput) ToLoadbalancerCertificateOutputWithContext(ctx context.Context) LoadbalancerCertificateOutput {
	return o
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoadbalancerCertificateInput)(nil)).Elem(), &LoadbalancerCertificate{})
	pulumi.RegisterOutputType(LoadbalancerCertificateOutput{})
}

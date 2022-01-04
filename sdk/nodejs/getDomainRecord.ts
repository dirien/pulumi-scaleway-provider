// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Gets information about a domain record.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * // Get record by name, type and data
 * const byContent = pulumi.output(scaleway.getDomainRecord({
 *     data: "1.2.3.4",
 *     dnsZone: "domain.tld",
 *     name: "www",
 *     type: "A",
 * }));
 * // Get info by ID
 * const byId = pulumi.output(scaleway.getDomainRecord({
 *     dnsZone: "domain.tld",
 *     recordId: "11111111-1111-1111-1111-111111111111",
 * }));
 * ```
 */
export function getDomainRecord(args?: GetDomainRecordArgs, opts?: pulumi.InvokeOptions): Promise<GetDomainRecordResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("scaleway:index/getDomainRecord:getDomainRecord", {
        "data": args.data,
        "dnsZone": args.dnsZone,
        "name": args.name,
        "recordId": args.recordId,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getDomainRecord.
 */
export interface GetDomainRecordArgs {
    /**
     * The content of the record (an IPv4 for an `A`, a string for a `TXT`...).
     * Cannot be used with `recordId`.
     */
    data?: string;
    /**
     * The IP address.
     */
    dnsZone?: string;
    /**
     * The name of the record (can be an empty string for a root record).
     * Cannot be used with `recordId`.
     */
    name?: string;
    /**
     * The record ID.
     * Cannot be used with `name`, `type` and `data`.
     */
    recordId?: string;
    /**
     * The type of the record (`A`, `AAAA`, `MX`, `CNAME`, `ALIAS`, `NS`, `PTR`, `SRV`, `TXT`, `TLSA`, or `CAA`).
     * Cannot be used with `recordId`.
     */
    type?: string;
}

/**
 * A collection of values returned by getDomainRecord.
 */
export interface GetDomainRecordResult {
    readonly data?: string;
    readonly dnsZone?: string;
    /**
     * Dynamic record base on user geolocalisation (More information about dynamic records)
     */
    readonly geoIps: outputs.GetDomainRecordGeoIp[];
    /**
     * Dynamic record base on URL resolve (More information about dynamic records)
     */
    readonly httpServices: outputs.GetDomainRecordHttpService[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly keepEmptyZone: boolean;
    readonly name?: string;
    /**
     * The priority of the record (mostly used with an `MX` record)
     */
    readonly priority: number;
    readonly projectId: string;
    readonly recordId?: string;
    /**
     * Time To Tive of the record in seconds.
     */
    readonly ttl: number;
    readonly type?: string;
    /**
     * Dynamic record based on the client’s (resolver) subnet (More information about dynamic records)
     */
    readonly views: outputs.GetDomainRecordView[];
    /**
     * Dynamic record base on IP weights (More information about dynamic records)
     */
    readonly weighteds: outputs.GetDomainRecordWeighted[];
}

export function getDomainRecordOutput(args?: GetDomainRecordOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDomainRecordResult> {
    return pulumi.output(args).apply(a => getDomainRecord(a, opts))
}

/**
 * A collection of arguments for invoking getDomainRecord.
 */
export interface GetDomainRecordOutputArgs {
    /**
     * The content of the record (an IPv4 for an `A`, a string for a `TXT`...).
     * Cannot be used with `recordId`.
     */
    data?: pulumi.Input<string>;
    /**
     * The IP address.
     */
    dnsZone?: pulumi.Input<string>;
    /**
     * The name of the record (can be an empty string for a root record).
     * Cannot be used with `recordId`.
     */
    name?: pulumi.Input<string>;
    /**
     * The record ID.
     * Cannot be used with `name`, `type` and `data`.
     */
    recordId?: pulumi.Input<string>;
    /**
     * The type of the record (`A`, `AAAA`, `MX`, `CNAME`, `ALIAS`, `NS`, `PTR`, `SRV`, `TXT`, `TLSA`, or `CAA`).
     * Cannot be used with `recordId`.
     */
    type?: pulumi.Input<string>;
}
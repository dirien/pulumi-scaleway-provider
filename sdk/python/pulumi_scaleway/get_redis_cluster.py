# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetRedisClusterResult',
    'AwaitableGetRedisClusterResult',
    'get_redis_cluster',
    'get_redis_cluster_output',
]

@pulumi.output_type
class GetRedisClusterResult:
    """
    A collection of values returned by getRedisCluster.
    """
    def __init__(__self__, acls=None, cluster_id=None, cluster_size=None, created_at=None, id=None, name=None, node_type=None, password=None, project_id=None, settings=None, tags=None, tls_enabled=None, updated_at=None, user_name=None, version=None, zone=None):
        if acls and not isinstance(acls, list):
            raise TypeError("Expected argument 'acls' to be a list")
        pulumi.set(__self__, "acls", acls)
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if cluster_size and not isinstance(cluster_size, int):
            raise TypeError("Expected argument 'cluster_size' to be a int")
        pulumi.set(__self__, "cluster_size", cluster_size)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if node_type and not isinstance(node_type, str):
            raise TypeError("Expected argument 'node_type' to be a str")
        pulumi.set(__self__, "node_type", node_type)
        if password and not isinstance(password, str):
            raise TypeError("Expected argument 'password' to be a str")
        pulumi.set(__self__, "password", password)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if settings and not isinstance(settings, dict):
            raise TypeError("Expected argument 'settings' to be a dict")
        pulumi.set(__self__, "settings", settings)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if tls_enabled and not isinstance(tls_enabled, bool):
            raise TypeError("Expected argument 'tls_enabled' to be a bool")
        pulumi.set(__self__, "tls_enabled", tls_enabled)
        if updated_at and not isinstance(updated_at, str):
            raise TypeError("Expected argument 'updated_at' to be a str")
        pulumi.set(__self__, "updated_at", updated_at)
        if user_name and not isinstance(user_name, str):
            raise TypeError("Expected argument 'user_name' to be a str")
        pulumi.set(__self__, "user_name", user_name)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)
        if zone and not isinstance(zone, str):
            raise TypeError("Expected argument 'zone' to be a str")
        pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter
    def acls(self) -> Sequence['outputs.GetRedisClusterAclResult']:
        return pulumi.get(self, "acls")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[str]:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="clusterSize")
    def cluster_size(self) -> int:
        return pulumi.get(self, "cluster_size")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> str:
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodeType")
    def node_type(self) -> str:
        return pulumi.get(self, "node_type")

    @property
    @pulumi.getter
    def password(self) -> str:
        return pulumi.get(self, "password")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def settings(self) -> Mapping[str, str]:
        return pulumi.get(self, "settings")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tlsEnabled")
    def tls_enabled(self) -> bool:
        return pulumi.get(self, "tls_enabled")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> str:
        return pulumi.get(self, "updated_at")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> str:
        return pulumi.get(self, "user_name")

    @property
    @pulumi.getter
    def version(self) -> str:
        return pulumi.get(self, "version")

    @property
    @pulumi.getter
    def zone(self) -> Optional[str]:
        return pulumi.get(self, "zone")


class AwaitableGetRedisClusterResult(GetRedisClusterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRedisClusterResult(
            acls=self.acls,
            cluster_id=self.cluster_id,
            cluster_size=self.cluster_size,
            created_at=self.created_at,
            id=self.id,
            name=self.name,
            node_type=self.node_type,
            password=self.password,
            project_id=self.project_id,
            settings=self.settings,
            tags=self.tags,
            tls_enabled=self.tls_enabled,
            updated_at=self.updated_at,
            user_name=self.user_name,
            version=self.version,
            zone=self.zone)


def get_redis_cluster(cluster_id: Optional[str] = None,
                      name: Optional[str] = None,
                      zone: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRedisClusterResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['name'] = name
    __args__['zone'] = zone
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
        if opts.plugin_download_url is None:
            opts.plugin_download_url = _utilities.get_plugin_download_url()
    __ret__ = pulumi.runtime.invoke('scaleway:index/getRedisCluster:getRedisCluster', __args__, opts=opts, typ=GetRedisClusterResult).value

    return AwaitableGetRedisClusterResult(
        acls=__ret__.acls,
        cluster_id=__ret__.cluster_id,
        cluster_size=__ret__.cluster_size,
        created_at=__ret__.created_at,
        id=__ret__.id,
        name=__ret__.name,
        node_type=__ret__.node_type,
        password=__ret__.password,
        project_id=__ret__.project_id,
        settings=__ret__.settings,
        tags=__ret__.tags,
        tls_enabled=__ret__.tls_enabled,
        updated_at=__ret__.updated_at,
        user_name=__ret__.user_name,
        version=__ret__.version,
        zone=__ret__.zone)


@_utilities.lift_output_func(get_redis_cluster)
def get_redis_cluster_output(cluster_id: Optional[pulumi.Input[Optional[str]]] = None,
                             name: Optional[pulumi.Input[Optional[str]]] = None,
                             zone: Optional[pulumi.Input[Optional[str]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRedisClusterResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...
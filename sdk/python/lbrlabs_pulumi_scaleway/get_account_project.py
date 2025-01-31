# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAccountProjectResult',
    'AwaitableGetAccountProjectResult',
    'get_account_project',
    'get_account_project_output',
]

@pulumi.output_type
class GetAccountProjectResult:
    """
    A collection of values returned by getAccountProject.
    """
    def __init__(__self__, created_at=None, description=None, id=None, name=None, organization_id=None, project_id=None, updated_at=None):
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if organization_id and not isinstance(organization_id, str):
            raise TypeError("Expected argument 'organization_id' to be a str")
        pulumi.set(__self__, "organization_id", organization_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if updated_at and not isinstance(updated_at, str):
            raise TypeError("Expected argument 'updated_at' to be a str")
        pulumi.set(__self__, "updated_at", updated_at)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> str:
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def description(self) -> str:
        return pulumi.get(self, "description")

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
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[str]:
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> str:
        return pulumi.get(self, "updated_at")


class AwaitableGetAccountProjectResult(GetAccountProjectResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccountProjectResult(
            created_at=self.created_at,
            description=self.description,
            id=self.id,
            name=self.name,
            organization_id=self.organization_id,
            project_id=self.project_id,
            updated_at=self.updated_at)


def get_account_project(name: Optional[str] = None,
                        organization_id: Optional[str] = None,
                        project_id: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccountProjectResult:
    """
    Gets information about an existing Project.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scaleway as scaleway

    by_name = scaleway.get_account_project(name="default")
    by_id = scaleway.get_account_project(project_id="xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
    ```


    :param str name: The name of the Project.
           Only one of the `name` and `project_id` should be specified.
    :param str organization_id: The organization ID the Project is associated with.
           If no default organization_id is set, one must be set explicitly in this datasource
    :param str project_id: The ID of the Project.
           Only one of the `name` and `project_id` should be specified.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['organizationId'] = organization_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scaleway:index/getAccountProject:getAccountProject', __args__, opts=opts, typ=GetAccountProjectResult).value

    return AwaitableGetAccountProjectResult(
        created_at=__ret__.created_at,
        description=__ret__.description,
        id=__ret__.id,
        name=__ret__.name,
        organization_id=__ret__.organization_id,
        project_id=__ret__.project_id,
        updated_at=__ret__.updated_at)


@_utilities.lift_output_func(get_account_project)
def get_account_project_output(name: Optional[pulumi.Input[Optional[str]]] = None,
                               organization_id: Optional[pulumi.Input[Optional[str]]] = None,
                               project_id: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAccountProjectResult]:
    """
    Gets information about an existing Project.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scaleway as scaleway

    by_name = scaleway.get_account_project(name="default")
    by_id = scaleway.get_account_project(project_id="xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
    ```


    :param str name: The name of the Project.
           Only one of the `name` and `project_id` should be specified.
    :param str organization_id: The organization ID the Project is associated with.
           If no default organization_id is set, one must be set explicitly in this datasource
    :param str project_id: The ID of the Project.
           Only one of the `name` and `project_id` should be specified.
    """
    ...

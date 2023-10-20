

# Template

Instance template

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maintainer** | **String** | Template maintainer |  [optional] [readonly] |
|**description** | **String** | Template description |  [optional] |
|**sshKeyEnabled** | **Boolean** | Enable SSH key-based login |  [optional] |
|**family** | **String** | Template family |  [optional] [readonly] |
|**name** | **String** | Template name |  [optional] |
|**defaultUser** | **String** | Template default user |  [optional] |
|**size** | **Long** | Template size |  [optional] |
|**passwordEnabled** | **Boolean** | Enable password-based login |  [optional] |
|**build** | **String** | Template build |  [optional] [readonly] |
|**checksum** | **String** | Template MD5 checksum |  [optional] |
|**bootMode** | [**BootModeEnum**](#BootModeEnum) | Boot mode (default: legacy) |  [optional] |
|**id** | **UUID** | Template ID |  [optional] [readonly] |
|**zones** | **List&lt;ZoneName&gt;** | Zones availability |  [optional] |
|**url** | **String** | Template source URL |  [optional] |
|**version** | **String** | Template version |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | Template creation date |  [optional] [readonly] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Template visibility |  [optional] [readonly] |



## Enum: BootModeEnum

| Name | Value |
|---- | -----|
| LEGACY | &quot;legacy&quot; |
| UEFI | &quot;uefi&quot; |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;private&quot; |
| PUBLIC | &quot;public&quot; |




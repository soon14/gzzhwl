package com.gzzhwl.api.driver.vo;

public class DriverAndVehicleVo {
	private String driverInfoId;
	private String vehicleInfoId;
	private String realName; // 真实姓名
	private String idno; // 身份证号
	private String dlEndDate; // 驾驶证有效期(止)
	private String qcNo; // 从业资格证号
	private String qcEndDate; // 从业资格证有效期(止)
	// private String departureCode; // 出发地所在区域
	// private String destinationCode; // 目的地所在区域
	private String idFImageRefId; // 身份照片(正)
	private String idBImageRefId; // 身份照片(反)
	private String photoFImageRefId; // 个人照片
	private String drivingFImageRefId; // 驾驶证照片(正)
	private String drivingBImageRefId; // 驾驶证照片(反)
	private String qualifiImageRefId; // 从业资格证照片
	private String qualifiImage2RefId;// 从业资格证照片2

	private String plateNumber; // 车牌号
	private String type; // 车型
	private String length; // 车长
	private String brand; // 品牌
	private String regDate; // 登记日期
	private String regCertCode; // 登记证书号
	private String ciEffectDate; // 强制险有效期
	private String ciName; // 强制险公司名称
	private String viEffectDate; // 商业险有效期
	private String viName; // 商业险公司名称
	private String licenseValidDate; // 行驶证有效期(止)
	private String operatingCertIssueDate; // 营运证发证日期
	private String loadWeight; // 核载重量

	private String licenseImageRefId; // 行驶证照片
	private java.lang.String licenseImage2RefId; // 行驶证照片2
	private String ocImageRefId; // 营运证照片
	private java.lang.String ocImage2RefId; // 营运证照片2
	private java.lang.String ocImage3RefId; // 营运证照片3
	private String vehicleImageRefId; // 车辆照片

	private String status;

	// private List<LineInfo> lines;

	public String getDriverInfoId() {
		return driverInfoId;
	}

	public String getQualifiImage2RefId() {
		return qualifiImage2RefId;
	}

	public void setQualifiImage2RefId(String qualifiImage2RefId) {
		this.qualifiImage2RefId = qualifiImage2RefId;
	}

	public java.lang.String getLicenseImage2RefId() {
		return licenseImage2RefId;
	}

	public void setLicenseImage2RefId(java.lang.String licenseImage2RefId) {
		this.licenseImage2RefId = licenseImage2RefId;
	}

	public java.lang.String getOcImage2RefId() {
		return ocImage2RefId;
	}

	public void setOcImage2RefId(java.lang.String ocImage2RefId) {
		this.ocImage2RefId = ocImage2RefId;
	}

	public java.lang.String getOcImage3RefId() {
		return ocImage3RefId;
	}

	public void setOcImage3RefId(java.lang.String ocImage3RefId) {
		this.ocImage3RefId = ocImage3RefId;
	}

	public void setDriverInfoId(String driverInfoId) {
		this.driverInfoId = driverInfoId;
	}

	public String getVehicleInfoId() {
		return vehicleInfoId;
	}

	public void setVehicleInfoId(String vehicleInfoId) {
		this.vehicleInfoId = vehicleInfoId;
	}

	// public List<LineInfo> getLines() {
	// return lines;
	// }
	// public void setLines(List<LineInfo> lines) {
	// this.lines = lines;
	// }
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLoadWeight() {
		return loadWeight;
	}

	public void setLoadWeight(String loadWeight) {
		this.loadWeight = loadWeight;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getRegCertCode() {
		return regCertCode;
	}

	public void setRegCertCode(String regCertCode) {
		this.regCertCode = regCertCode;
	}

	public String getCiEffectDate() {
		return ciEffectDate;
	}

	public void setCiEffectDate(String ciEffectDate) {
		this.ciEffectDate = ciEffectDate;
	}

	public String getCiName() {
		return ciName;
	}

	public void setCiName(String ciName) {
		this.ciName = ciName;
	}

	public String getViEffectDate() {
		return viEffectDate;
	}

	public void setViEffectDate(String viEffectDate) {
		this.viEffectDate = viEffectDate;
	}

	public String getViName() {
		return viName;
	}

	public void setViName(String viName) {
		this.viName = viName;
	}

	public String getLicenseValidDate() {
		return licenseValidDate;
	}

	public void setLicenseValidDate(String licenseValidDate) {
		this.licenseValidDate = licenseValidDate;
	}

	public String getOperatingCertIssueDate() {
		return operatingCertIssueDate;
	}

	public void setOperatingCertIssueDate(String operatingCertIssueDate) {
		this.operatingCertIssueDate = operatingCertIssueDate;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdno() {
		return idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public String getDlEndDate() {
		return dlEndDate;
	}

	public void setDlEndDate(String dlEndDate) {
		this.dlEndDate = dlEndDate;
	}

	public String getQcNo() {
		return qcNo;
	}

	public void setQcNo(String qcNo) {
		this.qcNo = qcNo;
	}

	public String getQcEndDate() {
		return qcEndDate;
	}

	public void setQcEndDate(String qcEndDate) {
		this.qcEndDate = qcEndDate;
	}

	public String getIdFImageRefId() {
		return idFImageRefId;
	}

	public void setIdFImageRefId(String idFImageRefId) {
		this.idFImageRefId = idFImageRefId;
	}

	public String getIdBImageRefId() {
		return idBImageRefId;
	}

	public void setIdBImageRefId(String idBImageRefId) {
		this.idBImageRefId = idBImageRefId;
	}

	public String getPhotoFImageRefId() {
		return photoFImageRefId;
	}

	public void setPhotoFImageRefId(String photoFImageRefId) {
		this.photoFImageRefId = photoFImageRefId;
	}

	public String getDrivingFImageRefId() {
		return drivingFImageRefId;
	}

	public void setDrivingFImageRefId(String drivingFImageRefId) {
		this.drivingFImageRefId = drivingFImageRefId;
	}

	public String getDrivingBImageRefId() {
		return drivingBImageRefId;
	}

	public void setDrivingBImageRefId(String drivingBImageRefId) {
		this.drivingBImageRefId = drivingBImageRefId;
	}

	public String getQualifiImageRefId() {
		return qualifiImageRefId;
	}

	public void setQualifiImageRefId(String qualifiImageRefId) {
		this.qualifiImageRefId = qualifiImageRefId;
	}

	public String getLicenseImageRefId() {
		return licenseImageRefId;
	}

	public void setLicenseImageRefId(String licenseImageRefId) {
		this.licenseImageRefId = licenseImageRefId;
	}

	public String getOcImageRefId() {
		return ocImageRefId;
	}

	public void setOcImageRefId(String ocImageRefId) {
		this.ocImageRefId = ocImageRefId;
	}

	public String getVehicleImageRefId() {
		return vehicleImageRefId;
	}

	public void setVehicleImageRefId(String vehicleImageRefId) {
		this.vehicleImageRefId = vehicleImageRefId;
	}

}

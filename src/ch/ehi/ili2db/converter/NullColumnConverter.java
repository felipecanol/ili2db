package ch.ehi.ili2db.converter;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;

import ch.ehi.ili2db.gui.Config;
import ch.interlis.iom.IomObject;

public class NullColumnConverter implements SqlColumnConverter {

	@Override
	public Object fromIomUuid(String value)
			throws SQLException, ConverterException {
		return null;
	}
	@Override
	public Object fromIomCoord(IomObject value, int srid, boolean is3D)
			throws SQLException, ConverterException {
		return null;
	}

	@Override
	public Object fromIomPolyline(IomObject obj, int srid, boolean is3D,double p)
			throws SQLException, ConverterException {
		return null;
	}

	@Override
	public Object fromIomSurface(IomObject obj, int srid, boolean hasLineAttr,
			boolean is3D,double p) throws SQLException, ConverterException {
		return null;
	}
	@Override
	public Object fromIomMultiSurface(IomObject obj, int srid, boolean hasLineAttr,
			boolean is3D,double p) throws SQLException, ConverterException {
		return null;
	}

	@Override
	public String getInsertValueWrapperCoord(String wkfValue, int srid) {
		return null;
	}

	@Override
	public String getInsertValueWrapperPolyline(String wkfValue, int srid) {
		return null;
	}

	@Override
	public String getInsertValueWrapperSurface(String wkfValue, int srid) {
		return null;
	}
	@Override
	public String getInsertValueWrapperMultiSurface(String wkfValue, int srid) {
		return null;
	}

	@Override
	public String getSelectValueWrapperDate(String sqlColName) {
		return null;
	}
	@Override
	public String getSelectValueWrapperTime(String sqlColName) {
		return null;
	}
	@Override
	public String getSelectValueWrapperDateTime(String sqlColName) {
		return null;
	}
	@Override
	public String getSelectValueWrapperCoord(String dbNativeValue) {
		return null;
	}

	@Override
	public String getSelectValueWrapperPolyline(String dbNativeValue) {
		return null;
	}

	@Override
	public String getSelectValueWrapperSurface(String dbNativeValue) {
		return null;
	}
	@Override
	public String getSelectValueWrapperMultiSurface(String dbNativeValue) {
		return null;
	}

	@Override
	public Integer getSrsid(String crsAuthority, String crsCode, Connection conn)
			throws ConverterException {
		return 0;
	}

	@Override
	public void setBoolean(PreparedStatement stmt, int parameterIndex,
			boolean value) throws SQLException {
	}
	@Override
	public void setTimestamp(PreparedStatement ps, int valuei,
			Timestamp datetime) throws SQLException{
	}
	@Override
	public void setDate(PreparedStatement ps, int valuei, Date date) throws SQLException{
	}
	@Override
	public void setTime(PreparedStatement ps, int valuei, Time time) throws SQLException{
	}

	@Override
	public void setCoordNull(PreparedStatement stmt, int parameterIndex)
			throws SQLException {
	}

	@Override
	public void setDecimalNull(PreparedStatement stmt, int parameterIndex)
			throws SQLException {
	}

	@Override
	public void setPolylineNull(PreparedStatement stmt, int parameterIndex)
			throws SQLException {
	}

	@Override
	public void setSurfaceNull(PreparedStatement stmt, int parameterIndex)
			throws SQLException {
	}
	@Override
	public void setUuidNull(PreparedStatement stmt, int parameterIndex) throws SQLException {
	}

	@Override
	public void setup(Connection conn, Config config) {
	}

	@Override
	public IomObject toIomCoord(Object geomobj, String sqlAttrName, boolean is3D)
			throws SQLException, ConverterException {
		return null;
	}

	@Override
	public IomObject toIomPolyline(Object geomobj, String sqlAttrName,
			boolean is3D) throws SQLException, ConverterException {
		return null;
	}

	@Override
	public IomObject toIomSurface(Object geomobj, String sqlAttrName,
			boolean is3D) throws SQLException, ConverterException {
		return null;
	}
	@Override
	public IomObject toIomMultiSurface(Object geomobj, String sqlAttrName,
			boolean is3D) throws SQLException, ConverterException {
		return null;
	}
	@Override
	public void setBlobNull(PreparedStatement stmt, int parameterIndex)
			throws SQLException {
	}
	@Override
	public void setXmlNull(PreparedStatement stmt, int parameterIndex)
			throws SQLException {
	}
	@Override
	public Object fromIomBlob(String uuid) throws SQLException,
			ConverterException {
		return null;
	}
	@Override
	public Object fromIomXml(String uuid) throws SQLException,
			ConverterException {
		return null;
	}
	@Override
	public String toIomXml(Object obj) throws SQLException, ConverterException {
		return null;
	}
	@Override
	public String toIomBlob(Object obj) throws SQLException, ConverterException {
		return null;
	}
}

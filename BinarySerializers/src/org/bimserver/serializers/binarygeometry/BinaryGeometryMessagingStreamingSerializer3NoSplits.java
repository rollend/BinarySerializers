package org.bimserver.serializers.binarygeometry;

/******************************************************************************
 * Copyright (C) 2009-2018  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import org.bimserver.emf.PackageMetaData;
import org.bimserver.plugins.PluginManagerInterface;
import org.bimserver.plugins.serializers.ObjectProvider;
import org.bimserver.plugins.serializers.ProjectInfo;
import org.bimserver.plugins.serializers.SerializerException;

public class BinaryGeometryMessagingStreamingSerializer3NoSplits extends BinaryGeometryMessagingStreamingSerializer3 {
	@Override
	public void init(ObjectProvider objectProvider, ProjectInfo projectInfo, PluginManagerInterface pluginManager, PackageMetaData packageMetaData) throws SerializerException {
		super.init(objectProvider, projectInfo, pluginManager, packageMetaData);
		setSplitGeometry(false);
	}
}
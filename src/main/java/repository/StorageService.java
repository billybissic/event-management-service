/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package repository;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Billy Bissic
 *
 */
public interface StorageService {

	void init();
	
	void store(MultipartFile file);
	
	Stream<Path> loadAll();

	Path load(String filename);
	
	Resource loadAsResource(String filename);
	
	void deleteAll();
}

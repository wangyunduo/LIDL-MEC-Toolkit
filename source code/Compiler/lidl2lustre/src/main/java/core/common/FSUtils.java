package core.common;

import core.err.InvalidFilePathException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FSUtils
{
	public static File createFile(String name, String... paths) throws IOException
	{
		return createFile(name, dirConcat(paths));
	}

	public static File createFile(String name) throws IOException
	{
		File outputFile = new File(name);
		File folderDir = outputFile.getParentFile();
		if (!folderDir.exists())
			folderDir.mkdirs();
		if (!outputFile.exists())
			outputFile.createNewFile();
		return outputFile;
	}

	public static File createFile(String name, String path) throws IOException
	{
		File outputFile = new File(path + File.separator + name);
		File folderDir = outputFile.getParentFile();
		if (!folderDir.exists())
			folderDir.mkdirs();
		if (!outputFile.exists())
			outputFile.createNewFile();
		return outputFile;
	}

	public static void deleteDir(File dir)
	{
		for (File f : searchFiles(dir))
		{
			if (f.isDirectory())
			{
				deleteDir(f);
			}
			else
			{
				f.delete();
			}
		}
		dir.delete();
	}

	public static void deleteDir(String path) throws IOException
	{
		File dir = new File(path);
		deleteDir(dir);
	}

	public static void clearOnlyFilesInDir(File dir)
	{
		for (File f : searchFiles(dir))
		{
			if (f.isDirectory())
			{
				clearOnlyFilesInDir(f);
			}
			else
			{
				f.delete();
			}
		}
	}

	public static void clearOnlyFilesInDir(String path)
	{
		File dir = new File(path);
		clearOnlyFilesInDir(dir);
	}

	public static File createDir(String... paths)
	{
		return createDir(dirConcat(paths));
	}

	public static File createDir(String path)
	{
		File dir = new File(path);
		dir.mkdirs();
		return dir;
	}

	public static List<File> searchFiles(File dir)
	{
		File[] files = dir.listFiles();
		List<File> list = new ArrayList<>();
		if (files != null)
			list.addAll(Arrays.asList(files));
		return list;
	}

	public static List<File> searchFiles(String path)
	{
		File dir = new File(path);
		return searchFiles(dir);
	}

	public static List<File> searchFilesWithExt(String path, String ext)
	{
		return searchFiles(path).stream().filter(
				(x) -> ext.equals(getExt(x.getName()))
		).collect(Collectors.toList());
	}

	public static String getExt(String path)
	{
		String[] n = path.split("\\.");
		if (n.length <= 1)
			return null;
		return n[n.length - 1];
	}

	public static List<File> searchFilesWithExt(String inputPath, String name, String ext)
	{
		List<File> list = searchFilesWithExt(inputPath, ext);
		return list.stream().filter((x) -> x.getName().equals(name + ext)).collect(Collectors.toList());
	}

	public static List<File> searchFilesWithExt(String inputPath, String ext, Predicate<File> filter)
	{
		List<File> list = searchFilesWithExt(inputPath, ext);
		return list.stream().filter(filter).collect(Collectors.toList());
	}

	public static File getFile(String path)
	{
		File f = new File(path);
		return f.isFile() ? f : null;
	}

	public static List<File> getFiles(List<String> path)
	{
		List<File> list = new ArrayList<>();
		for (String p : path)
		{
			File f = getFile(p);
			if (f != null)
				list.add(f);
		}
		return list;
	}

	public static List<File> getFilesErrorThrow(List<String> path) throws InvalidFilePathException
	{
		List<File> list = new ArrayList<>();
		for (String p : path)
		{
			File f = getFile(p);
			if (f != null)
				list.add(f);
			else
				throw new InvalidFilePathException(String.format("<%s> not found", p));
		}
		return list;
	}

	public static String dirConcat(String... paths)
	{
		return String.join(File.separator, paths);
	}
}

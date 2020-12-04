USE [gandre03]
GO

/****** Object:  Table [dbo].[ALBUM]    Script Date: 04-Dec-20 6:52:50 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[ALBUM]') AND type in (N'U'))
DROP TABLE [dbo].[ALBUM]
GO

/****** Object:  Table [dbo].[ALBUM]    Script Date: 04-Dec-20 6:52:50 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[ALBUM](
	[albumID] [int] NOT NULL,
	[userID] [int] NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[description] [nvarchar](max) NOT NULL,
	[location] [int] NULL,
	[link] [nvarchar](50) NOT NULL,
	[privacy] [char](10) NOT NULL,
	[count] [int] NOT NULL,
	[comments] [nvarchar](50) NOT NULL,
	[photos] [varbinary](max) NOT NULL,
 CONSTRAINT [PK_ALBUM] PRIMARY KEY CLUSTERED 
(
	[albumID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO



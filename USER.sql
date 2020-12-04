USE [gandre03]
GO

/****** Object:  Table [dbo].[USER]    Script Date: 04-Dec-20 6:00:10 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[USER]') AND type in (N'U'))
DROP TABLE [dbo].[USER]
GO

/****** Object:  Table [dbo].[USER]    Script Date: 04-Dec-20 6:00:10 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[USER](
	[UserID] [int] NOT NULL,
	[first_name] [nvarchar](15) NOT NULL,
	[last_name] [nvarchar](20) NOT NULL,
	[full_name] [nvarchar](50) NOT NULL,
	[link] [nvarchar](200) NOT NULL,
	[birthday] [date] NOT NULL,
	[work] [nvarchar](40) NULL,
	[education] [nvarchar](25) NULL,
	[email] [nvarchar](50) NOT NULL,
	[website] [nvarchar](50) NULL,
	[hometown] [int] NOT NULL,
	[location] [int] NOT NULL,
	[quotes] [nvarchar](100) NULL,
	[gender] [int] NOT NULL,
	[interested_in] [nvarchar](25) NULL,
	[verified] [nchar](1) NOT NULL,

) ON [PRIMARY]
GO



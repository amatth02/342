USE [mdiola01]
GO

/****** Object:  Table [dbo].[USER]    Script Date: 04/12/2020 11:20:18 pm ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[USER]') AND type in (N'U'))
DROP TABLE [dbo].[USER]
GO

/****** Object:  Table [dbo].[USER]    Script Date: 04/12/2020 11:20:18 pm ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[USER](
	[userID] [int] NOT NULL,
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
 CONSTRAINT [PK_USER] PRIMARY KEY CLUSTERED 
(
	[userID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO



USE [mdiola01]
GO

/****** Object:  Table [dbo].[CITY]    Script Date: 04/12/2020 11:16:34 pm ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[CITY]') AND type in (N'U'))
DROP TABLE [dbo].[CITY]
GO

/****** Object:  Table [dbo].[CITY]    Script Date: 04/12/2020 11:16:34 pm ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[CITY](
	[cityID] [int] NOT NULL,
	[city_name] [nvarchar](50) NOT NULL,
	[zipcode] [int] NOT NULL,
	[address] [nvarchar](50) NOT NULL,
	[num] [int] NOT NULL,
 CONSTRAINT [PK_CITY] PRIMARY KEY CLUSTERED 
(
	[cityID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO



package com.alina.harghitacounty.model

import androidx.annotation.DrawableRes
import com.alina.harghitacounty.constants.Constants.BILBOR_ICON
import com.alina.harghitacounty.constants.Constants.BILBOR_IMAGE
import com.alina.harghitacounty.constants.Constants.BILBOR_LINK
import com.alina.harghitacounty.constants.Constants.BILBOR_LONG_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.BILBOR_NAME
import com.alina.harghitacounty.constants.Constants.BILBOR_SHORT_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.BILBOR_SUBTITLE
import com.alina.harghitacounty.constants.Constants.BORSEC_ICON
import com.alina.harghitacounty.constants.Constants.BORSEC_IMAGE
import com.alina.harghitacounty.constants.Constants.BORSEC_LINK
import com.alina.harghitacounty.constants.Constants.BORSEC_LONG_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.BORSEC_NAME
import com.alina.harghitacounty.constants.Constants.BORSEC_SHORT_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.BORSEC_SUBTITLE
import com.alina.harghitacounty.constants.Constants.CASTELUL_LAZAR_ICON
import com.alina.harghitacounty.constants.Constants.CASTELUL_LAZAR_IMAGE
import com.alina.harghitacounty.constants.Constants.CASTELUL_LAZAR_LINK
import com.alina.harghitacounty.constants.Constants.CASTELUL_LAZAR_LONG_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.CASTELUL_LAZAR_NAME
import com.alina.harghitacounty.constants.Constants.CASTELUL_LAZAR_SHORT_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.CASTELUL_LAZAR_SUBTITLE
import com.alina.harghitacounty.constants.Constants.CIUC_ICON
import com.alina.harghitacounty.constants.Constants.CIUC_IMAGE
import com.alina.harghitacounty.constants.Constants.CIUC_LINK
import com.alina.harghitacounty.constants.Constants.CIUC_LONG_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.CIUC_NAME
import com.alina.harghitacounty.constants.Constants.CIUC_SHORT_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.CIUC_SUBTITLE
import com.alina.harghitacounty.constants.Constants.LACUL_ROSU_ICON
import com.alina.harghitacounty.constants.Constants.LACUL_ROSU_IMAGE
import com.alina.harghitacounty.constants.Constants.LACUL_ROSU_LINK
import com.alina.harghitacounty.constants.Constants.LACUL_ROSU_LONG_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.LACUL_ROSU_NAME
import com.alina.harghitacounty.constants.Constants.LACUL_ROSU_SHORT_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.LACUL_ROSU_SUBTITLE
import com.alina.harghitacounty.constants.Constants.LACUL_SFANTA_ANA_ICON
import com.alina.harghitacounty.constants.Constants.LACUL_SFANTA_ANA_IMAGE
import com.alina.harghitacounty.constants.Constants.LACUL_SFANTA_ANA_LINK
import com.alina.harghitacounty.constants.Constants.LACUL_SFANTA_ANA_LONG_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.LACUL_SFANTA_ANA_NAME
import com.alina.harghitacounty.constants.Constants.LACUL_SFANTA_ANA_SHORT_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.LACUL_SFANTA_ANA_SUBTITLE
import com.alina.harghitacounty.constants.Constants.MADARAS_ICON
import com.alina.harghitacounty.constants.Constants.MADARAS_IMAGE
import com.alina.harghitacounty.constants.Constants.MADARAS_LINK
import com.alina.harghitacounty.constants.Constants.MADARAS_LONG_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.MADARAS_NAME
import com.alina.harghitacounty.constants.Constants.MADARAS_SHORT_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.MADARAS_SUBTITLE
import com.alina.harghitacounty.constants.Constants.ODORHEIU_SECUIESC_ICON
import com.alina.harghitacounty.constants.Constants.ODORHEIU_SECUIESC_IMAGE
import com.alina.harghitacounty.constants.Constants.ODORHEIU_SECUIESC_LINK
import com.alina.harghitacounty.constants.Constants.ODORHEIU_SECUIESC_LONG_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.ODORHEIU_SECUIESC_NAME
import com.alina.harghitacounty.constants.Constants.ODORHEIU_SECUIESC_SHORT_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.ODORHEIU_SECUIESC_SUBTITLE
import com.alina.harghitacounty.constants.Constants.POIANA_NARCISELOR_ICON
import com.alina.harghitacounty.constants.Constants.POIANA_NARCISELOR_IMAGE
import com.alina.harghitacounty.constants.Constants.POIANA_NARCISELOR_LINK
import com.alina.harghitacounty.constants.Constants.POIANA_NARCISELOR_LONG_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.POIANA_NARCISELOR_NAME
import com.alina.harghitacounty.constants.Constants.POIANA_NARCISELOR_SHORT_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.POIANA_NARCISELOR_SUBTITLE
import com.alina.harghitacounty.constants.Constants.SALINA_PRAID_ICON
import com.alina.harghitacounty.constants.Constants.SALINA_PRAID_IMAGE
import com.alina.harghitacounty.constants.Constants.SALINA_PRAID_LINK
import com.alina.harghitacounty.constants.Constants.SALINA_PRAID_LONG_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.SALINA_PRAID_NAME
import com.alina.harghitacounty.constants.Constants.SALINA_PRAID_SHORT_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.SALINA_PRAID_SUBTITLE
import com.alina.harghitacounty.constants.Constants.SFANTU_ILIE_ICON
import com.alina.harghitacounty.constants.Constants.SFANTU_ILIE_IMAGE
import com.alina.harghitacounty.constants.Constants.SFANTU_ILIE_LINK
import com.alina.harghitacounty.constants.Constants.SFANTU_ILIE_LONG_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.SFANTU_ILIE_NAME
import com.alina.harghitacounty.constants.Constants.SFANTU_ILIE_SHORT_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.SFANTU_ILIE_SUBTITLE
import com.alina.harghitacounty.constants.Constants.TUSNAD_ICON
import com.alina.harghitacounty.constants.Constants.TUSNAD_IMAGE
import com.alina.harghitacounty.constants.Constants.TUSNAD_LINK
import com.alina.harghitacounty.constants.Constants.TUSNAD_LONG_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.TUSNAD_NAME
import com.alina.harghitacounty.constants.Constants.TUSNAD_SHORT_DESCRIPTION
import com.alina.harghitacounty.constants.Constants.TUSNAD_SUBTITLE

data class Objectives(
    val name: String,
    val subtitle: String,
    val shortDescription: String,
    val longDescription: String,
    val link: String,
    @DrawableRes val icon: Int,
    @DrawableRes val image: Int
)

val objectives_list = listOf(
    Objectives(
        LACUL_ROSU_NAME,
        LACUL_ROSU_SUBTITLE,
        LACUL_ROSU_SHORT_DESCRIPTION,
        LACUL_ROSU_LONG_DESCRIPTION,
        LACUL_ROSU_LINK,
        LACUL_ROSU_ICON,
        LACUL_ROSU_IMAGE
    ),
    Objectives(
        LACUL_SFANTA_ANA_NAME,
        LACUL_SFANTA_ANA_SUBTITLE,
        LACUL_SFANTA_ANA_SHORT_DESCRIPTION,
        LACUL_SFANTA_ANA_LONG_DESCRIPTION,
        LACUL_SFANTA_ANA_LINK,
        LACUL_SFANTA_ANA_ICON,
        LACUL_SFANTA_ANA_IMAGE
    ),
    Objectives(
        SALINA_PRAID_NAME,
        SALINA_PRAID_SUBTITLE,
        SALINA_PRAID_SHORT_DESCRIPTION,
        SALINA_PRAID_LONG_DESCRIPTION,
        SALINA_PRAID_LINK,
        SALINA_PRAID_ICON,
        SALINA_PRAID_IMAGE
    ),
    Objectives(
        BILBOR_NAME,
        BILBOR_SUBTITLE,
        BILBOR_SHORT_DESCRIPTION,
        BILBOR_LONG_DESCRIPTION,
        BILBOR_LINK,
        BILBOR_ICON,
        BILBOR_IMAGE
    ),
    Objectives(
        BORSEC_NAME,
        BORSEC_SUBTITLE,
        BORSEC_SHORT_DESCRIPTION,
        BORSEC_LONG_DESCRIPTION,
        BORSEC_LINK,
        BORSEC_ICON,
        BORSEC_IMAGE
    ),
    Objectives(
        TUSNAD_NAME,
        TUSNAD_SUBTITLE,
        TUSNAD_SHORT_DESCRIPTION,
        TUSNAD_LONG_DESCRIPTION,
        TUSNAD_LINK,
        TUSNAD_ICON,
        TUSNAD_IMAGE
    ),
    Objectives(
        POIANA_NARCISELOR_NAME,
        POIANA_NARCISELOR_SUBTITLE,
        POIANA_NARCISELOR_SHORT_DESCRIPTION,
        POIANA_NARCISELOR_LONG_DESCRIPTION,
        POIANA_NARCISELOR_LINK,
        POIANA_NARCISELOR_ICON,
        POIANA_NARCISELOR_IMAGE
    ),
    Objectives(
        CASTELUL_LAZAR_NAME,
        CASTELUL_LAZAR_SUBTITLE,
        CASTELUL_LAZAR_SHORT_DESCRIPTION,
        CASTELUL_LAZAR_LONG_DESCRIPTION,
        CASTELUL_LAZAR_LINK,
        CASTELUL_LAZAR_ICON,
        CASTELUL_LAZAR_IMAGE
    ),
    Objectives(
        CIUC_NAME,
        CIUC_SUBTITLE,
        CIUC_SHORT_DESCRIPTION,
        CIUC_LONG_DESCRIPTION,
        CIUC_LINK,
        CIUC_ICON,
        CIUC_IMAGE
    ),
    Objectives(
        MADARAS_NAME,
        MADARAS_SUBTITLE,
        MADARAS_SHORT_DESCRIPTION,
        MADARAS_LONG_DESCRIPTION,
        MADARAS_LINK,
        MADARAS_ICON,
        MADARAS_IMAGE
    ),
    Objectives(
        ODORHEIU_SECUIESC_NAME,
        ODORHEIU_SECUIESC_SUBTITLE,
        ODORHEIU_SECUIESC_SHORT_DESCRIPTION,
        ODORHEIU_SECUIESC_LONG_DESCRIPTION,
        ODORHEIU_SECUIESC_LINK,
        ODORHEIU_SECUIESC_ICON,
        ODORHEIU_SECUIESC_IMAGE
    ),
    Objectives(
        SFANTU_ILIE_NAME,
        SFANTU_ILIE_SUBTITLE,
        SFANTU_ILIE_SHORT_DESCRIPTION,
        SFANTU_ILIE_LONG_DESCRIPTION,
        SFANTU_ILIE_LINK,
        SFANTU_ILIE_ICON,
        SFANTU_ILIE_IMAGE
    ),
)
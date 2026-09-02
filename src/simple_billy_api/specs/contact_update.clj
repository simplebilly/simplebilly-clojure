(ns simple-billy-api.specs.contact-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.contact-type :refer :all]
            [simple-billy-api.specs.country-code :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.sepa-sequence-type :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.country-code :refer :all]
            )
  (:import (java.io File)))


(def contact-update-data
  {
   (ds/opt :accountHolder) string?
   (ds/opt :acquisitionCost) string?
   (ds/opt :addressSupplement) string?
   (ds/opt :attention) string?
   (ds/opt :bankName) string?
   (ds/opt :bic) string?
   (ds/opt :buyerReference) string?
   (ds/opt :category) string?
   (ds/opt :certificateAuthority) string?
   (ds/opt :certificateNumber) string?
   (ds/opt :certificateParagraph) string?
   (ds/opt :certificateValidUntil) inst?
   (ds/opt :city) string?
   (ds/opt :companyName) string?
   (ds/opt :contactPersons) any-type-spec
   (ds/opt :contactType) contact-type-spec
   (ds/opt :country) country-code-spec
   (ds/opt :creditLimit) string?
   (ds/opt :creditorAccountSkr03) string?
   (ds/opt :creditorAccountSkr04) string?
   (ds/opt :currency) string?
   (ds/opt :customFields) any-type-spec
   (ds/opt :customerNumber) string?
   (ds/opt :debitorAccountSkr03) string?
   (ds/opt :debitorAccountSkr04) string?
   (ds/opt :defaultDebitorNumber) string?
   (ds/opt :deliveryBlock) boolean?
   (ds/opt :department) string?
   (ds/opt :discountDays) int?
   (ds/opt :discountPercentage) string?
   (ds/opt :donationReceiptEligible) boolean?
   (ds/opt :email) string?
   (ds/opt :externalId) string?
   (ds/opt :fax) string?
   (ds/opt :iban) string?
   (ds/opt :industry) string?
   (ds/opt :isActive) boolean?
   (ds/opt :isMember) boolean?
   (ds/opt :isNonprofit) boolean?
   (ds/opt :lastContactDate) inst?
   (ds/opt :lastPurchaseDate) inst?
   (ds/opt :leitwegId) string?
   (ds/opt :lifetimeValue) string?
   (ds/opt :mandateDate) inst?
   (ds/opt :mandateReference) string?
   (ds/opt :marketingConsent) boolean?
   (ds/opt :marketingConsentAt) inst?
   (ds/opt :marketingConsentSource) string?
   (ds/opt :mobile) string?
   (ds/opt :name) string?
   (ds/opt :nextContactDate) inst?
   (ds/opt :notes) string?
   (ds/opt :openingBalance) string?
   (ds/opt :openingBalanceDate) inst?
   (ds/opt :orderReference) string?
   (ds/opt :paymentBlock) boolean?
   (ds/opt :paymentGracePeriodDays) int?
   (ds/opt :paymentMethods) (s/coll-of string?)
   (ds/opt :paymentTerms) string?
   (ds/opt :phone) string?
   (ds/opt :rating) int?
   (ds/opt :salesRepresentative) string?
   (ds/opt :sepaBatchBooking) boolean?
   (ds/opt :sepaSequenceType) sepa-sequence-type-spec
   (ds/opt :socialMedia) any-type-spec
   (ds/opt :source) string?
   (ds/opt :state) string?
   (ds/opt :street) string?
   (ds/opt :streetNumber) string?
   (ds/opt :supplierNumber) string?
   (ds/opt :tags) (s/coll-of string?)
   (ds/opt :taxCountry) country-code-spec
   (ds/opt :taxNumber) string?
   (ds/opt :taxOffice) string?
   (ds/opt :totalInvoices) int?
   (ds/opt :totalRevenue) string?
   (ds/opt :vatId) string?
   (ds/opt :vatIdValidated) boolean?
   (ds/opt :vatIdValidationDate) inst?
   (ds/opt :website) string?
   (ds/opt :zip) string?
   })

(def contact-update-spec
  (ds/spec
    {:name ::contact-update
     :spec contact-update-data}))

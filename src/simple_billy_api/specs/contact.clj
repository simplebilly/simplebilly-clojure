(ns simple-billy-api.specs.contact
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def contact-data
  {
   (ds/opt :account_holder) string?
   (ds/opt :acquisition_cost) string?
   (ds/opt :address_supplement) string?
   (ds/opt :attention) string?
   (ds/opt :bank_name) string?
   (ds/opt :bic) string?
   (ds/opt :buyer_reference) string?
   (ds/opt :category) string?
   (ds/opt :certificate_authority) string?
   (ds/opt :certificate_number) string?
   (ds/opt :certificate_paragraph) string?
   (ds/opt :certificate_valid_until) string?
   (ds/opt :city) string?
   (ds/opt :company_name) string?
   (ds/req :contact_id) string?
   (ds/req :contact_persons) any-type-spec
   (ds/req :contact_type) string?
   (ds/opt :country) string?
   (ds/req :created_at) string?
   (ds/opt :credit_limit) string?
   (ds/opt :creditor_account_skr03) string?
   (ds/opt :creditor_account_skr04) string?
   (ds/opt :currency) string?
   (ds/opt :customer_number) string?
   (ds/opt :debitor_account_skr03) string?
   (ds/opt :debitor_account_skr04) string?
   (ds/opt :default_debitor_number) string?
   (ds/opt :delivery_block) boolean?
   (ds/opt :department) string?
   (ds/opt :discount_days) int?
   (ds/opt :discount_percentage) string?
   (ds/opt :donation_receipt_eligible) boolean?
   (ds/opt :email) string?
   (ds/opt :external_id) string?
   (ds/opt :fax) string?
   (ds/opt :iban) string?
   (ds/opt :industry) string?
   (ds/opt :is_active) boolean?
   (ds/opt :is_member) boolean?
   (ds/opt :is_nonprofit) boolean?
   (ds/opt :last_contact_date) string?
   (ds/opt :last_purchase_date) string?
   (ds/opt :leitweg_id) string?
   (ds/opt :lifetime_value) string?
   (ds/opt :mandate_date) string?
   (ds/opt :mandate_reference) string?
   (ds/opt :marketing_consent) boolean?
   (ds/opt :marketing_consent_at) string?
   (ds/opt :marketing_consent_source) string?
   (ds/opt :mobile) string?
   (ds/req :name) string?
   (ds/opt :next_contact_date) string?
   (ds/opt :notes) string?
   (ds/opt :opening_balance) string?
   (ds/opt :opening_balance_date) string?
   (ds/opt :order_reference) string?
   (ds/opt :payment_block) boolean?
   (ds/opt :payment_grace_period_days) int?
   (ds/opt :payment_methods) (s/coll-of string?)
   (ds/opt :payment_terms) string?
   (ds/opt :phone) string?
   (ds/opt :rating) int?
   (ds/opt :sales_representative) string?
   (ds/req :social_media) any-type-spec
   (ds/opt :source) string?
   (ds/opt :state) string?
   (ds/opt :street) string?
   (ds/opt :street_number) string?
   (ds/opt :supplier_number) string?
   (ds/opt :tags) (s/coll-of string?)
   (ds/opt :tax_country) string?
   (ds/opt :tax_number) string?
   (ds/opt :tax_office) string?
   (ds/opt :total_invoices) int?
   (ds/opt :total_revenue) string?
   (ds/opt :updated_at) string?
   (ds/opt :vat_id) string?
   (ds/opt :vat_id_validated) boolean?
   (ds/opt :vat_id_validation_date) string?
   (ds/opt :website) string?
   (ds/opt :zip) string?
   })

(def contact-spec
  (ds/spec
    {:name ::contact
     :spec contact-data}))

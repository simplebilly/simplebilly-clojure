(ns simple-billy-api.specs.posting-category
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def posting-category-data
  {
   (ds/opt :account_number) string?
   (ds/opt :account_number_skr03) string?
   (ds/opt :account_number_skr04) string?
   (ds/opt :account_number_skr49) string?
   (ds/req :category_id) string?
   (ds/req :default_vat_rate) int?
   (ds/opt :description) string?
   (ds/opt :eks_category) string?
   (ds/req :is_active) boolean?
   (ds/req :is_system) boolean?
   (ds/req :name) string?
   (ds/req :skr_version) string?
   (ds/req :type) string?
   })

(def posting-category-spec
  (ds/spec
    {:name ::posting-category
     :spec posting-category-data}))

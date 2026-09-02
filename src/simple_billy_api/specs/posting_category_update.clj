(ns simple-billy-api.specs.posting-category-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.posting-category-type :refer :all]
            )
  (:import (java.io File)))


(def posting-category-update-data
  {
   (ds/opt :accountNumber) string?
   (ds/opt :accountNumberSkr03) string?
   (ds/opt :accountNumberSkr04) string?
   (ds/opt :accountNumberSkr49) string?
   (ds/opt :categoryType) posting-category-type-spec
   (ds/opt :createdAt) inst?
   (ds/opt :defaultVatRate) int?
   (ds/opt :description) string?
   (ds/opt :eksCategory) string?
   (ds/opt :euVatLine) int?
   (ds/opt :inputVatPercentage) string?
   (ds/opt :isActive) boolean?
   (ds/opt :isSystem) boolean?
   (ds/opt :name) string?
   (ds/opt :skrVersion) string?
   (ds/opt :updatedAt) inst?
   (ds/opt :userModifiedSkr03) boolean?
   (ds/opt :userModifiedSkr04) boolean?
   })

(def posting-category-update-spec
  (ds/spec
    {:name ::posting-category-update
     :spec posting-category-update-data}))

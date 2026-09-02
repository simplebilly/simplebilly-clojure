(ns simple-billy-api.specs.posting-category-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.posting-category-type :refer :all]
            )
  (:import (java.io File)))


(def posting-category-create-data
  {
   (ds/opt :accountNumber) string?
   (ds/opt :accountNumberSkr03) string?
   (ds/opt :accountNumberSkr04) string?
   (ds/opt :accountNumberSkr49) string?
   (ds/req :categoryType) posting-category-type-spec
   (ds/req :createdAt) inst?
   (ds/req :defaultVatRate) int?
   (ds/opt :description) string?
   (ds/opt :eksCategory) string?
   (ds/opt :euVatLine) int?
   (ds/req :inputVatPercentage) string?
   (ds/req :isActive) boolean?
   (ds/req :isSystem) boolean?
   (ds/req :name) string?
   (ds/req :skrVersion) string?
   (ds/opt :updatedAt) inst?
   (ds/req :userModifiedSkr03) boolean?
   (ds/req :userModifiedSkr04) boolean?
   })

(def posting-category-create-spec
  (ds/spec
    {:name ::posting-category-create
     :spec posting-category-create-data}))

(ns simple-billy-api.specs.legal-document-upsert
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def legal-document-upsert-data
  {
   (ds/req :content) string?
   (ds/req :docType) string?
   (ds/req :lang) string?
   (ds/req :title) string?
   })

(def legal-document-upsert-spec
  (ds/spec
    {:name ::legal-document-upsert
     :spec legal-document-upsert-data}))

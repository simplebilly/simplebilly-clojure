(ns simple-billy-api.specs.attachment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def attachment-data
  {
   (ds/opt :contactId) string?
   (ds/req :fileName) string?
   (ds/opt :fileSize) int?
   (ds/opt :mimeType) string?
   (ds/opt :ocrText) string?
   (ds/req :originalName) string?
   (ds/opt :pdfaPath) string?
   (ds/opt :sha256Hash) string?
   (ds/opt :uploadedBy) uuid?
   })

(def attachment-spec
  (ds/spec
    {:name ::attachment
     :spec attachment-data}))

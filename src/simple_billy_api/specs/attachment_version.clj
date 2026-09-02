(ns simple-billy-api.specs.attachment-version
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def attachment-version-data
  {
   (ds/req :attachmentId) uuid?
   (ds/req :fileName) string?
   (ds/opt :fileSize) int?
   (ds/opt :mimeType) string?
   (ds/opt :originalName) string?
   (ds/opt :sha256Hash) string?
   (ds/opt :uploadedBy) uuid?
   (ds/req :versionNumber) int?
   })

(def attachment-version-spec
  (ds/spec
    {:name ::attachment-version
     :spec attachment-version-data}))

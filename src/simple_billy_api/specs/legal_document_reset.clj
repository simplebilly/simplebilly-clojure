(ns simple-billy-api.specs.legal-document-reset
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def legal-document-reset-data
  {
   (ds/opt :docType) string?
   (ds/opt :lang) string?
   })

(def legal-document-reset-spec
  (ds/spec
    {:name ::legal-document-reset
     :spec legal-document-reset-data}))

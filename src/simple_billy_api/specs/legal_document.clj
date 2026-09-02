(ns simple-billy-api.specs.legal-document
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.legal-doc-type :refer :all]
            [simple-billy-api.specs.language-code :refer :all]
            )
  (:import (java.io File)))


(def legal-document-data
  {
   (ds/req :content) string?
   (ds/req :docType) legal-doc-type-spec
   (ds/req :lang) language-code-spec
   (ds/req :title) string?
   })

(def legal-document-spec
  (ds/spec
    {:name ::legal-document
     :spec legal-document-data}))
